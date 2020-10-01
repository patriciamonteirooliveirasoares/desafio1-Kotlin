import Curso.Curso
import Curso as Curso1
import kotlin.Int as KotlinInt

class DigitalHouseManager<Int>(var listaAlunos: MutableList<Aluno>,
                               var listaProfessor: MutableList<Professor>,
                               var listaCurso: MutableList<Curso1>,
                               var listaMatricula: MutableList<Matricula>) {

    val cursoNovo: Curso1
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
                                  sobrenome: kotlin.Int,
                                  codigoProfessor: KotlinInt,
                                  quantidadeDeHoras: KotlinInt) {

        var profAdj = ProfesorAdjunto(nome, sobrenome, 0.0)
        val add = listaProfessor.add(profAdj)

    }


    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: KotlinInt,
                                  especialidade: String): ProfessorTitular {

        val add = listaProfessor.add(Professor(
                nome,
                sobrenome,
                tempoDeCasa = 0,
                codigoProfessor = codigoProfessor,
                especialidade = ""))



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


        var matriculaAluno = Aluno ("", "", 0)
        var matriculaCurso = Curso ("")

        for (aluno in listaAlunos) {
            if (aluno.codigoAluno == codigoAluno) matriculaAluno = aluno
        }

        for (curso in listaCurso) {
            if (curso.codigoCurso == codigoCurso) {
                matriculaCurso = Curso
            }
        }

        if (matriculaAluno == null) {
            throw Exception ("Não foi possível localizar o aluno desejado!")
        }

        if (matriculaCurso == null) {
            throw  Exception ("Não há vagas disponíveis para o curso pesquisado!!")
        }

        if (matriculaCurso.listaAlunosMatr.javaClass == matriculaCurso.qtdeMaxAlunos) {
            matriculaAluno.add(Aluno)

            var fazerMatricula = matriculaAluno?.let { Matricula (matriculaCurso.toString(), it) }
            if (fazerMatricula != null) {
                listaMatricula.add(fazerMatricula)
            }
            print("Sua matrícula foi validada com sucesso!!!")
        } else {
            print("Desculpe, não foi possível realizar sua matrícula. Confira o curso e tente novamente!")

        }

    }


        fun alocarProfessores(codigoCurso: kotlin.Int,
                              codigoProfessor: ProfessorTitular,
                              codigoProfessor: ProfesorAdjunto ) {

            var usarTitular = ProfessorTitular ("", "")
            var usarAdjunto = ProfesorAdjunto ("", 0.0)

            for (professor in listaProfessor) {
                if (professor.codigoProfessor.toString() == codigoProfessor.toString()) {
                    usarTitular = registrarProfessorTitular("", "", 0, "")
                } else (professor.codigoProfessor.toString() == codigoProfessor.toString()){
                    usarAdjunto = registrarProfessorAdjunto("", 0)
                }
            }

            for (curso in listaCurso) {
                if (curso.codigoCurso == codigoCurso) {
                    curso.professorTitular = usarTitular
                    curso.profesorAdjunto = usarAdjunto
                }
            }

        }

    private fun registrarProfessorAdjunto(nome: Any, sobrenome: Any): ProfesorAdjunto {
        return registrarProfessorAdjunto()
    }


    private fun Matricula(Aluno: String, Curso: Aluno) {

    }

}

private operator fun Any.invoke(value: Any) {

}

private fun <E> MutableList<E>.add(element: Unit) {

}

private fun Any.add(element: ProfesorAdjunto) {

}
