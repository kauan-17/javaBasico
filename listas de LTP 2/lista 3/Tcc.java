class TCC {
    String aluno;
    String orientador;
    String avaliador1;
    String avaliador2;
    String titulo;
    int status; // 0 - em execução, 1 - aprovado, 2 - reprovado
    double notaOrientador;
    double notaAvaliador1;
    double notaAvaliador2;

    public TCC(String aluno, String orientador, String avaliador1, String avaliador2, String titulo) {
        this.aluno = aluno;
        this.orientador = orientador;
        this.avaliador1 = avaliador1;
        this.avaliador2 = avaliador2;
        this.titulo = titulo;
        this.status = 0; // Inicialmente, TCC em execução
    }

    public void inserirDefesa(double notaOrientador, double notaAvaliador1, double notaAvaliador2) {
        this.notaOrientador = notaOrientador;
        this.notaAvaliador1 = notaAvaliador1;
        this.notaAvaliador2 = notaAvaliador2;

        double mediaNotas = (notaOrientador + notaAvaliador1 + notaAvaliador2) / 3;

        if (mediaNotas >= 6.0) {
            this.status = 1; // TCC aprovado
        } else {
            this.status = 2; // TCC reprovado
        }
    }
}
