package src.diskManagement;

import java.io.FileOutputStream;

import src.diskSimulator.SNode;

//classe que implementa o gerenciador de disco 
public class FileManagement implements FileManagementInterface,VirtualDiskInspectionInterface {
    
    private String NameOfDisk; 
    private LimitDictionary limits;

    private FileOutputStream diskFile;
    private int maxFile, maxDir;
    

    //devemos buscar o arquivo com o nome. Se o nome for igual, abrimos o arquivo
    //caso contrario, criamos o arquivo nulo

    /*
     * como não temos comando para alteração de tamanho de arquivo, os arquivos serão adicionados de forma sequencial.
     * Na hora de removermos eles, eles apenas serão deletados do map de bits 
     */

    /**Inicialização do disco virtual
     *@param NameOfDisk nome do disco 
     *@param maxFile tamanho máximo do disco
     *@param maxDir tamanho máximo de diretorio
     */

    /*inicialização do disco */
     public FileManagement(String NameOfDisk, int maxFile, int maxDir){
        this.NameOfDisk = NameOfDisk; 
        this.maxDir = maxDir;
        this.maxFile = maxFile; 

        this.createRootDisk();
    }

    


    //criação do disco 
    private boolean createDisk(){
    
        if((maxFile%8 != 0 || maxDir%8 != 0) || (maxFile<limits.getMinFilePerBlocks() || maxFile>limits.getMaxFilePerBlocks()) || (maxDir<limits.getMinFilePerBlocks() && maxDir>limits.getMaxFilePerBlocks())){ //verificação se os valores estabelecem o critério de criação S 
            return false; 
        }
        else {
           try{ //criação do arquivo binário que simula o disco 
              this.diskFile = new FileOutputStream("../disk/"+this.NameOfDisk+".dat");
              return true;
            } catch(Exception e){ //disco não foi criado com exito 
                System.out.println(e);
            }
            
        }

        return false; 
    }


    //criação do root do disco 
    private boolean createRootDisk(){ //instanciação do root 
        SNode root = new SNode(0b00000010, 0, 00, 0, 0, 0, 0, 0, 0);
        
        
        return false; 
    }

    @Override
    public boolean addDirectory(String pathname, String filename) throws InvalidEntryException, VirtualFileNotFoundException {
        
        return false;
    }

    @Override
    public boolean addFile(String pathname, String filename, FileType type, int length)
            throws InvalidEntryException, VirtualFileNotFoundException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deleteFile(String pathname, String filename)
            throws InvalidEntryException, VirtualFileNotFoundException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String[] listDirectory(String pathname) throws InvalidEntryException, VirtualFileNotFoundException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean parseCommandFile(String pathname) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean saveVirtualDisk() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getSNodeInfo(int snodeId) throws InvalidSNodeException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSnodeBitmap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getDataBlockBitmap() {
        // TODO Auto-generated method stub
        return null;
    } 
 


}