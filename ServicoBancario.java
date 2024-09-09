public abstract class ServicoBancario {
    protected Usuario usuario;

    public ServicoBancario(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract void realizarServico();
}
