import kotlin.Int as KotlinInt

class DigitalHouseManager<Int>(var listaAlunos: MutableList<Aluno>,
                               var listaProfessor: MutableList<Professor>,
                               var listaCurso: MutableList<Curso>,
                               var listaMatricula: MutableList<Matricula>) {

    val cursoNovo: Curso
        get() {
            TODO()
        }


    fun registrarCurso(nome: String,
                       codigoCurso: KotlinInt,
                       quantidadeMaximaDeAlunos: KotlinInt) {

        cursoNovo.nomeCurso = nome
        cursoNovo.codigoCurso = codigoCurso
        cursoNovo.quantidadeMaximaDeAlunos ?: quantidadeMaximaDeAlunos

        listaCurso.add(cursoNovo)
    }


    fun excluirCurso(codigoCurso: KotlinInt) {

        for (curso in listaCurso) {
            if (curso.codigoCurso == codigoCurso) {
                listaCurso.remove(curso)
            }
        }
    }


    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: KotlinInt,
                                  quantidadeDeHoras: KotlinInt) {

        var profAdj = ProfesorAdjunto(nome, sobrenome, 0.0)
        val add = listaProfessor.add(profAdj)

    }


    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: KotlinInt,
                                  especialidade: String) {

        val add = listaProfessor.add(Professor(
                nome,
                sobrenome,
                tempoDeCasa = 0,
                codigoProfessor = codigoProfessor,
                especialidade = ""))
    }


    fun excluirProfessor(codigoProfessor: KotlinInt) {

        for (professor in listaProfessor) {
            if (professor.codigoProfessor == codigoProfessor) {
                val remove = listaProfessor.remove(professor)
            }
        }
    }


    fun matricularAluno (nome: String, sobrenome: String, codigoAluno: Int) {

        for(aluno in listaAlunos) {
            if(aluno.codigoAluno == codigoAluno) {
                listaAlunos.add(aluno)
            }
        }
    }


    fun matricularAluno (codigoAluno: Int, codigoCurso: kotlin.Int) {

        

    }

}

private fun Any.add(element: ProfesorAdjunto) {

}
