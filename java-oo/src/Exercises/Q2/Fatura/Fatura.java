package Exercises.Q2.Fatura;

public class Fatura {
    private int numeroDoItemFaturado;
    private String descricao;
    private int quatidadeComprada;
    private double precoUnitarioDoItem;
    private double precoTotalDaFatura;

    public Fatura(int numeroDoItemFaturado, String descricao, int quatidadeComprada, double precoUnitarioDoItem){
        this.numeroDoItemFaturado = numeroDoItemFaturado;
        this.descricao = descricao;
        this.quatidadeComprada = quatidadeComprada;
        this.precoUnitarioDoItem = precoUnitarioDoItem;
    }

    public int getNumeroDoItemFaturado() {
        return numeroDoItemFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuatidadeComprada() {
        return quatidadeComprada;
    }

    public double getPrecoUnitarioDoItem() {
        return precoUnitarioDoItem;
    }

    public double getPrecoTotalDaFatura() {
        precoTotalDaFatura = getPrecoUnitarioDoItem() * getQuatidadeComprada();
        return precoTotalDaFatura;
    }

    public void setNumeroDoItemFaturado(int numeroDoItemFaturado) {
        this.numeroDoItemFaturado = numeroDoItemFaturado;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuatidadeComprada(int quatidadeComprada) {
        this.quatidadeComprada = quatidadeComprada;
        if (quatidadeComprada < 0 ){
            this.quatidadeComprada = 0;
        }
    }

    public void setPrecoUnitarioDoItem(double precoUnitarioDoItem) {
        this.precoUnitarioDoItem = precoUnitarioDoItem;
        if (precoUnitarioDoItem < 0 ){
            this.precoUnitarioDoItem = 0.0;
        }
    }

    public void setPrecoTotalDaFatura(double precoTotalDaFatura) {
        this.precoTotalDaFatura = precoTotalDaFatura;
    }

    public double calculaDesconto(double percentDesconto){
        return this.precoTotalDaFatura = getPrecoTotalDaFatura() - (getPrecoTotalDaFatura() * percentDesconto);
    }
}
