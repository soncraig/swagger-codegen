package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class WordRelatedInput extends WordnikObject {

		 //Word for which to return related words
		 private String word ;  
			 //CSV list of part-of-speech types
		 private String partOfSpeech ;  
			 //Get data from a single dictionary. Valid options are ahd, century, wiktionary, webster, and wordnet.
		 private String sourceDictionary ;  
			 //Maximum number of results to return
		 private String limit ;  
			 //If true will try to return the correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 private String useCanonical ;  
			 //Relationship type
		 private String type ;  
		
	
		 //Word for which to return related words
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //CSV list of part-of-speech types
		 @AllowableValues(value="noun,adjective,verb,adverb,interjection,pronoun,preposition,abbreviation,affix,article,auxiliary-verb,conjunction,definite-article,family-name,given-name,idiom,imperative,noun-plural,noun-posessive,past-participle,phrasal-prefix,proper-noun,proper-noun-plural,proper-noun-posessive,suffix,verb-intransitive,verb-transitive")	 
		 public String getPartOfSpeech() {
		 	return partOfSpeech;
		 }  
		 
		 public void setPartOfSpeech(String  partOfSpeech) {
		 	this.partOfSpeech = partOfSpeech;
		 }
			 //Get data from a single dictionary. Valid options are ahd, century, wiktionary, webster, and wordnet.
		 
		 public String getSourceDictionary() {
		 	return sourceDictionary;
		 }  
		 
		 public void setSourceDictionary(String  sourceDictionary) {
		 	this.sourceDictionary = sourceDictionary;
		 }
			 //Maximum number of results to return
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
			 //If true will try to return the correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 @AllowableValues(value="false,true")	 
		 public String getUseCanonical() {
		 	return useCanonical;
		 }  
		 
		 public void setUseCanonical(String  useCanonical) {
		 	this.useCanonical = useCanonical;
		 }
			 //Relationship type
		 @AllowableValues(value="synonym,antonym,variant,equivalent,cross-reference,related-word,rhyme,form,etymologically-related-term,hypernym,hyponym,inflected-form,primary,same-context,verb-form,verb-stem,unknown")	 
		 public String getType() {
		 	return type;
		 }  
		 
		 public void setType(String  type) {
		 	this.type = type;
		 }
		
}