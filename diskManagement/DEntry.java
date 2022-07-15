package diskManagement;
public class DEntry {
    private long SNodeIdentifier; 
    private short EntryLenght; 
    /*  tamanho total em bytes da entrada do diretorio. multiplo de 16
    // nome do arq/dir + 6 bytes
    // 6 bytes: snodeidentifier, entrylegnth,filetype,filenamelength
     bits extras 
    */
     private byte FileType; // o mesmo tipo do snode associado
    // file type vai receber valor do snode[SNodeIdentifier], algo assim
    private byte FileNameLength;
    private byte[] FileName;


    public DEntry(long SNodeIdentifier, short EntryLenght, byte FileType, byte FileNameLength, byte[] FileName) {
        this.SNodeIdentifier = SNodeIdentifier;
        this.EntryLenght = EntryLenght;
        this.FileType = FileType;
        this.FileNameLength = FileNameLength;
        this.FileName = FileName;
    }


    public long getSNodeIdentifier() {
        return this.SNodeIdentifier;
    }

    public void setSNodeIdentifier(long SNodeIdentifier) {
        this.SNodeIdentifier = SNodeIdentifier;
    }

    public short getEntryLenght() {
        return this.EntryLenght;
    }

    public void setEntryLenght(short EntryLenght) {
        this.EntryLenght = EntryLenght;
    }

    public byte getFileType() {
        return this.FileType;
    }

    public void setFileType(byte FileType) {
        this.FileType = FileType;
    }

    public byte getFileNameLength() {
        return this.FileNameLength;
    }

    public void setFileNameLength(byte FileNameLength) {
        this.FileNameLength = FileNameLength;
    }

    public byte[] getFileName() {
        return this.FileName;
    }

    public void setFileName(byte[] FileName) {
        this.FileName = FileName;
    }



}
