package br.com.dimed.liberador.exception;

public class SampleLiberadorException extends RuntimeException{

    public SampleLiberadorException(){
        super("Convenio informado não é um liberador a prazo");
    }

    public SampleLiberadorException(String message){
        super(message);
    }

}
