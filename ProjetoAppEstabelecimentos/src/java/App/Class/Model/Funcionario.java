
package App.Class.Model;

//Classe bean Funcionario

//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo

public class Funcionario {
    
    private int id_funcionario;
    private String nome;
    private String matricula;
    private String img;
    private Estabelecimentos estabelecimento;
    private TipoFuncionario tipoFuncionario;

    public Funcionario() {
    }

    public Funcionario(int id_funcionario, String nome, String matricula, String img, Estabelecimentos estabelecimento, TipoFuncionario tipoFuncionario) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.matricula = matricula;
        this.img = img;
        this.estabelecimento = estabelecimento;
        this.tipoFuncionario = tipoFuncionario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Estabelecimentos getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimentos estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public TipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }
    
    
    
    
}
