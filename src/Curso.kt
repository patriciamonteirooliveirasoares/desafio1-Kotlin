class Curso(var nomeCurso: String,
            var codigoCurso: Int,
            var professorTitular: ProfessorTitular,
            var profesorAdjunto: ProfesorAdjunto,
            var qtdeMaxAlunos: Int,
            var listaAlunosMatr: ArrayList<Aluno> ) {


    var quantidadeMaximaDeAlunos: Boolean

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        if (qtdeMaxAlunos >= listaAlunosMatr.size) {
             return false
        }
        listaAlunosMatr.add(umAluno)
             return true
    }

    fun excluirAluno(umAluno: Aluno){
        listaAlunosMatr.remove(umAluno)
    }

}