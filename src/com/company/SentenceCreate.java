package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ridhwaan on 3/16/17.
 */
public class SentenceCreate {

    private String inputText;

    public SentenceCreate(String inputText){
        this.inputText = inputText;
        createSenteceArray(convertToCharArray(inputText));

    }




    public char[] convertToCharArray(String text)
    {

        for (int i = 0; i < text.toCharArray().length; i++) {
            System.out.print(text.toCharArray()[i]);
        }
        return text.toCharArray();
    }

    public void createSenteceArray(char[] charArray){

        ArrayList<Sentence> senteceList = new ArrayList<>();
        String sentence = null;

        for(int i = 0; i<charArray.length; i++){

            int firstIndex = 0;
            int finalIndex;



            if(charArray[i] == '.'){

                finalIndex = i;
                int length = i - firstIndex;

                char firstLetterValue = charArray[i - 1];

                for(int j = firstIndex; i < finalIndex; i++ ){

                    sentence = String.copyValueOf(charArray,firstIndex,finalIndex);

                }

                System.out.println(sentence);


                senteceList.add(new Sentence(firstLetterValue, length, sentence));

            }



        }


    }


}
