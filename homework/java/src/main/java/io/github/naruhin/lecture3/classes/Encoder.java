package io.github.naruhin.lecture3.classes;

public class Encoder {

    public Encoder(){

    }

    public void encode(short code){
        System.out.printf("%d => '%c' \n", code,(char) code );
    }

    public void encodeDemo(){
        for(short i = 0; i < 128; i ++){
            encode(i);
        }
    }


    public void decode(char symbol){
        System.out.printf("'%c' => %d \n", symbol,(int) symbol );
    }

    public void decodeDemo(){
        for(short i = 0; i < 128; i++){
            decode((char)i);
        }
    }


}
