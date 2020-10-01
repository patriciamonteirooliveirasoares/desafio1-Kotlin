fun main(){
    var aluno = Aluno("Patricia", "Soares", 202001)

    println(aluno.nome)
    println(aluno.sobrenome)
    println(aluno.codigoAluno)

    val especialidade = ""
    var professor = Professor("Ham", "Sam", 3, 201709, especialidade)

    println(professor.nome)
    println(professor.sobrenome)
    println(professor.tempoDeCasa)
    println(professor.codigoProfessor)


    var professorTitular = ProfessorTitular("Ham", "Mini Culturas")

    println(professorTitular)


}



