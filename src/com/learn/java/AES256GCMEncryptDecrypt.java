package com.learn.java;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;


public class AES256GCMEncryptDecrypt {

	static String plainText = "{\"userId\":\"10379\",\"firstName\":\"PULIN\",\"lastName\":\"PANDYA\",\"phoneNo\":\"9773810171\",\"email\":\"siddhi.chavan08@gmail.com\",\"agentCode\":\"00080865\",\"partners\":[{\"partner\":\"HDFC Bank\",\"channel\":\"\",\"subChannel\":\"\"}],\"expireAt\":1600259135549}";
	public static final String encryptionKey = "tGAcGKrBNvJLcPiAZAR32juiw83Hmk0n" ;
	public static final int AES_KEY_SIZE = 256;
	public static final int GCM_IV_LENGTH = 12;
	public static final int GCM_TAG_LENGTH = 16;
	private static final String characterEncoding       = "UTF-8";
	private static final String aesEncryptionAlgorithem = "AES";

	public static void main(String[] args) throws Exception {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(AES_KEY_SIZE);

		// Generate Key
		byte[] keyBytes      = encryptionKey.getBytes(characterEncoding);
		SecretKeySpec secretKey = new SecretKeySpec(keyBytes, aesEncryptionAlgorithem);
		
		
		byte[] IV = new byte[GCM_IV_LENGTH];
		SecureRandom random = new SecureRandom();
		random.nextBytes(IV);
		

		System.out.println("Original Text : " + plainText);

		byte[] cipherText = encrypt(plainText.getBytes(), secretKey, IV);
		String finalEncryptedString = Base64.encodeBase64URLSafeString(cipherText) ; 
		
		System.out.println("Final Encrypted Text : " +finalEncryptedString );
		String hashData = hashMessage(plainText) ;
		System.out.println("Hash data : " +hashData );
		String token = finalEncryptedString+ "."+hashData;
		System.out.println("SSO token : "+token) ;
		
		//System.out.println("IV for Encrypted Text : " + Base64.encodeBase64URLSafeString(IV));
		
		/******* Decryption of encrypted text *******/
		
		String decryptedText = decryptBase64(finalEncryptedString, secretKey) ;
		System.out.println("DeCrypted Text : " + decryptedText);
		
		/******* END of Decryption of encrypted text *******/
		
		
		
		/******* Decryption of encrypted text generated through NODE *******/
		
		String strToDecrypt =   "z0HokoTusvPyFB_GvRJXc-2lE1vApsfxjtdQ3PhsNOif4V7EkTk3l1kmt3BEXamGdcZIgpsrdHYSCthzAQBvUOI32XzvIiTROSVBzHzv6QObGwcyz19LUQFfCA-VPSAYttxnEM8Of6I9ZpdNAmmhVc-uikVwHl26Cf-Dxbr_Pb9xqePuaPf-yIAXwgTmUqlx-JjFUA9Yi23mSxIi0sc782vCq_hpxcvJcD_DH7DXf8YZpC0hVi7q0uDEWizLxPtHO86RDmhkD38XxdMvP0ejMuJfRs05WYMcvCXE5qS6qo-smTQREYcOi_q3CcPjLrYQpQT28pT9YyC8jxgAYE9VEhQo0A" ;
		
		String sampleDecrypted = decryptBase64(strToDecrypt, secretKey) ;
		System.out.println("Sample DeCrypted Text : " + sampleDecrypted);
		
		/******* END of Decryption of encrypted text generated through NODE *******/
		
	}

	public static byte[] encrypt(byte[] plaintext, SecretKey key, byte[] IV) throws Exception {
		// Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

		// Create GCMParameterSpec
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

		// Initialize Cipher for ENCRYPT_MODE
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);

		// Perform Encryption
		byte[] cipherText = cipher.doFinal(plaintext);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		outputStream.write( IV );
		outputStream.write( cipherText );
		byte[] finalCipherText = outputStream.toByteArray( );
		return finalCipherText;
	}
	
	public static String decryptBase64(String encryptedStr, SecretKey key) throws Exception {
		byte[] toDecyptCipherText = Base64.decodeBase64(encryptedStr) ;
		byte[] IV =  Arrays.copyOfRange(toDecyptCipherText, 0 , GCM_IV_LENGTH) ;
		byte[] cipherText = Arrays.copyOfRange(toDecyptCipherText, GCM_IV_LENGTH , toDecyptCipherText.length) ;
		return decrypt(cipherText, key , IV) ;
	}
	

	public static String decrypt(byte[] cipherText, SecretKey key, byte[] IV) throws Exception {
		// Get Cipher Instance
		Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");

		// Create SecretKeySpec
		SecretKeySpec keySpec = new SecretKeySpec(key.getEncoded(), "AES");

		// Create GCMParameterSpec
		GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, IV);

		// Initialize Cipher for DECRYPT_MODE
		cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);

		// Perform Decryption
		byte[] decryptedText = cipher.doFinal(cipherText);

		return new String(decryptedText);
	}
	
	public static String hashMessage(String message )throws Exception {
		
		System.out.println("Messagetohash: "+message) ;
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashInBytes = md.digest(message.getBytes(StandardCharsets.UTF_8));
        String hashString = Base64.encodeBase64URLSafeString(hashInBytes) ; 
        System.out.println("Base64 hashed message: "+hashString ) ;
        return hashString ;
	}

}