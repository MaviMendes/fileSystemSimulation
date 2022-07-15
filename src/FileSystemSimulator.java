package src;

import java.io.*;


public class FileSystemSimulator {
    private String NameOfDisk; 
    private int maxFile;
    private int maxDir;
    private int limiteInferior = 16, limiteSuperior = 65536;    

    private FileOutputStream diskFile;


    /**Inicialização do disco virtual
     *@param NameOfDisk nome do disco 
     *@param maxFile tamanho máximo do disco
     *@param maxDir tamanho máximo de diretorio
     */

    /*inicialização do disco */
     public FileSystemSimulator(String NameOfDisk, int maxFile, int maxDir){
        this.NameOfDisk = NameOfDisk; 
        this.maxFile = maxFile;
        this.maxDir = maxDir; 
    }

    //criação do disco e instanciação do diskManagement  
    private boolean createDisk(){
    
        if((maxFile%8 != 0 || maxDir%8 != 0) || (maxFile<limiteInferior || maxFile>limiteSuperior) || (maxDir<limiteInferior && maxDir>limiteSuperior)){ //verificação se os valores estabelecem o critério de criação S 
            return false; 
        }
        else {
           try{ //criação do arquivo que simula o disco 
              this.diskFile = new FileOutputStream("../disk/diskFile.dat");

            } catch(Exception e){ //disco não foi criado 
                System.out.println(e);
            }
            
        }
        return false;
    } 
 
    


    


}
