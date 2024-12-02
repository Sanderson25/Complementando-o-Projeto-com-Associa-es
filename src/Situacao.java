public class Situacao {
    private boolean aprovado;
    private boolean reprovado;

    public Situacao(boolean aprovado, boolean reprovado) {
        this.aprovado = aprovado;
        this.reprovado = reprovado;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean isReprovado() {
        return reprovado;
    }

    public void setReprovado(boolean reprovado) {
        this.reprovado = reprovado;
    }
}
