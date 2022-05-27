cadastrados = 0
aprovados = 0
exame = 0
reprovados = 0
totalFemAprovado = 0
totalMascAprovado = 0
totalFemRecup = 0
totalMascRecup = 0
totalFemReprovado = 0
totalMascReprovado = 0

cadastro = input ("Deseja se cadastrar? ").upper()

while (cadastro != "S" and cadastro != "N"):
    print("Opção Inválida! Tente novamente")
    cadastro = input ("Deseja se cadastrar? ")

while (cadastro == "S"):
    cadastrados += 1
    nome = input("Digite seu nome: ")
    sexo = input("Digite o sexo: ")

    while (sexo != "F" and sexo != "M"):
        print("Sexo inválido")
        sexo = input("Digite o sexo: ")

    print(f"Olá {nome}, informe suas notas abaixo: ")
    nota1 = float(input("Digite a primeira nota: "))
    nota2 = float(input("Digite a primeira nota: "))
    nota3 = float(input("Digite a primeira nota: "))

    media = (nota1 + nota2 + nota3) / 3
    print(f"Sua média é: {media}")

    if (media >=7):
        print("Você está aprovado!")
        aprovados += 1

    elif (media >=4 and media <7):
        print("Você está de recuperação!")
        exame +=1
    else:
        print("Você está reprovado!")
        reprovados +=1

    if (sexo == "F" and media >= 7):
        totalFemAprovado += 1
    elif(sexo == "F" and media >=4 and media <7):
        totalFemRecup += 1
    elif(sexo == "F" and media <4):
        totalFemReprovado += 1
    elif (sexo == "M" and media >= 7):
        totalMascAprovado += 1
    elif(sexo == "M" and media >=4 and media <7):
        totalMascRecup += 1
    elif(sexo == "M" and media <4):
        totalMascReprovado += 1

    continuar =input('Continuar? ')
    if (continuar != "S" and continuar != "N"):
        print("Opção Inválida! Tente novamente")
        continuar = input('Continuar? ')
    elif (continuar == "N"):
        break
    

print("Resultado")

print(f"Total alunos cadastrados: {cadastrados}")
print(f"Total alunos aprovados: {aprovados}")
print(f"Total alunos em recuperação: {exame}")
print(f"Total alunos reprovados: {reprovados}")
print(f"Total mulheres aprovadas: {totalFemAprovado}")
print(f"Total homens aprovados: {totalMascAprovado}")
print(f"Total mulheres recuperação: {totalFemRecup}")
print(f"Total homens recuperação: {totalMascRecup}")
print(f"Total mulheres reprovadas: {totalFemReprovado}")
print(f"Total homens reprovados: {totalMascReprovado}")

print(f"Porcentagem dos alunos aprovados: {aprovados*100/cadastrados}%")
print(f"Porcentagem dos alunos em recuperação: {exame*100/cadastrados}%")
print(f"Porcentagem dos alunos reprovados: {reprovados*100/cadastrados}%")