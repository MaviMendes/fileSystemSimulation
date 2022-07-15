package diskSimulator;
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
    public SNode(int i, int j, long CreationDate, long ModificationDate, int k, long DataBlock_01, long DataBlock_02, long DataBlock_03, long DataBlock_04) {
        this.FileTrype = i;
        this.Generation = j;
        this.CreationDate = CreationDate;
        this.ModificationDate = ModificationDate;
        this.Length = k;
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
    

    
}
