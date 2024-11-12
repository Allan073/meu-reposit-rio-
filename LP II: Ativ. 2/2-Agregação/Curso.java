class Curso{
    private String curso, local;

    public Curso(String c, String l){
        this.curso = c;
        this.local = l;
    }

    public String getCurso(){
        return curso;
    }

    public String getLocal(){
        return local;
    }

    public void mostrarCurso(){
        System.out.println("Curso: " + curso);
        System.out.println("Local: " + local);
    }

}
