public class SNode {
    // tamanho fixo de 28 bytes em disco

    private Byte FileTrype;
    private Byte Generation;
    private long CreationDate;
    private long ModificationDate;
    /*
     * Arquivo:
     * recebe o mesmo valor de CreationDate
     * Diretorio:
     * atualizado sempre que houver alteracao no diretorio
     */
    private short Length; 
    private long DataBlock_01;
    private long DataBlock_02;
    private long DataBlock_03;
    private long DataBlock_04;

    // Diretorio
    public SNode(Byte FileTrype, Byte Generation, long CreationDate, long ModificationDate, short Length, long DataBlock_01, long DataBlock_02, long DataBlock_03, long DataBlock_04) {
        this.FileTrype = FileTrype;
        this.Generation = Generation;
        this.CreationDate = CreationDate;
        this.ModificationDate = ModificationDate;
        this.Length = Length;
        this.DataBlock_01 = DataBlock_01;
        this.DataBlock_02 = DataBlock_02;
        this.DataBlock_03 = DataBlock_03;
        this.DataBlock_04 = DataBlock_04;
    }

    // Arquivo
    public SNode(Byte FileTrype, Byte Generation, long CreationDate, short Length, long DataBlock_01, long DataBlock_02, long DataBlock_03, long DataBlock_04) {
        this.FileTrype = FileTrype;
        this.Generation = Generation;
        this.CreationDate = CreationDate;
        this.ModificationDate = CreationDate;
        this.Length = Length;
        this.DataBlock_01 = DataBlock_01;
        this.DataBlock_02 = DataBlock_02;
        this.DataBlock_03 = DataBlock_03;
        this.DataBlock_04 = DataBlock_04;
    }
    

    public Byte getFileTrype() {
        return this.FileTrype;
    }

    public void setFileTrype(Byte FileTrype) {
        this.FileTrype = FileTrype;
    }

    public Byte getGeneration() {
        return this.Generation;
    }

    public void setGeneration(Byte Generation) {
        this.Generation = Generation;
    }

    public long getCreationDate() {
        return this.CreationDate;
    }

    public void setCreationDate(long CreationDate) {
        this.CreationDate = CreationDate;
    }

    public long getModificationDate() {
        return this.ModificationDate;
    }

    public void setModificationDate(long ModificationDate) {
        this.ModificationDate = ModificationDate;
    }

    public short getLength() {
        return this.Length;
    }

    public void setLength(short Length) {
        this.Length = Length;
    }

    public long getDataBlock_01() {
        return this.DataBlock_01;
    }

    public void setDataBlock_01(long DataBlock_01) {
        this.DataBlock_01 = DataBlock_01;
    }

    public long getDataBlock_02() {
        return this.DataBlock_02;
    }

    public void setDataBlock_02(long DataBlock_02) {
        this.DataBlock_02 = DataBlock_02;
    }

    public long getDataBlock_03() {
        return this.DataBlock_03;
    }

    public void setDataBlock_03(long DataBlock_03) {
        this.DataBlock_03 = DataBlock_03;
    }

    public long getDataBlock_04() {
        return this.DataBlock_04;
    }

    public void setDataBlock_04(long DataBlock_04) {
        this.DataBlock_04 = DataBlock_04;
    }

    
}
