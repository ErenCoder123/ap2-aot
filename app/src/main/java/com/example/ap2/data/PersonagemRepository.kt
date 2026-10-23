package com.example.ap2.data

import com.example.ap2.model.Personagem

object PersonagemRepository {

    private val personagens = listOf(
        Personagem(
            id = 1,
            nome = "Eren Yeager",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/eren-jaeger.jpg",
            descricao = "Protagonista nascido no distrito de Shiganshina. Após presenciar a destruição de sua cidade natal e a morte de sua mãe por titãs, jurou exterminar todos os titãs da face da Terra. Mais tarde descobre que herdou o poder do Titã de Ataque e do Titã Fundador de seu pai, Grisha Yeager. Conforme a verdade sobre o mundo além das muralhas e Marley é revelada, Eren toma um rumo sombrio para garantir a liberdade de Eldia a qualquer custo.",
            status = "Falecido",
            tita = "Titã de Ataque, Fundador e Martelo de Guerra",
            habilidade = "Combate com DMT, endurecimento estrutural e controle de Titãs"
        ),
        Personagem(
            id = 2,
            nome = "Mikasa Ackerman",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/mikasa-ackermann.jpg",
            descricao = "Irmã adotiva de Eren e última descendente conhecida do clã asiático e da linhagem Ackerman dentro das muralhas. Dona de habilidades prodigiosas de combate corpo a corpo e manuseio do DMT, Mikasa formou-se como a melhor aluna da 104ª Tropa de Cadetes. Sua principal motivação durante grande parte de sua vida é proteger Eren Yeager, a quem é profundamente ligada.",
            status = "Vivo",
            tita = "Humana (Linhagem Ackerman Despertada)",
            habilidade = "Mestre absoluta em DMT e combate com lâminas duplas"
        ),
        Personagem(
            id = 3,
            nome = "Armin Arlert",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/armin-arlelt.jpg",
            descricao = "Amigo de infância inseparável de Eren e Mikasa. Apesar de não possuir grande força física ou agilidade atlética, Armin compensa com uma inteligência estratégica extraordinária, capaz de prever táticas inimigas e encontrar soluções cruciais em situações desesperadoras. Foi o cérebro por trás de inúmeras vitórias das muralhas e herdou o poder do Titã Colossal.",
            status = "Vivo",
            tita = "Titã Colossal",
            habilidade = "Estrategista militar genial e explosão atômica colossal"
        ),
        Personagem(
            id = 4,
            nome = "Levi Ackerman",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/levi-ackermann.jpg",
            descricao = "Capitão do Esquadrão de Operações Especiais da Divisão de Reconhecimento, amplamente considerado o soldado mais forte de toda a humanidade. Criado no submundo sombrio das muralhas, Levi possui velocidade sobre-humana, precisão cirúrgica e reflexos instantâneos. Apesar de sua frieza aparente, zela profundamente pela vida e pelo sacrifício de seus companheiros.",
            status = "Vivo",
            tita = "Humano (Linhagem Ackerman Despertada)",
            habilidade = "Reflexos sobre-humanos, velocidade extrema e técnicas giratórias de corte"
        ),
        Personagem(
            id = 5,
            nome = "Erwin Smith",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/erwin-smith.jpg",
            descricao = "O 13º Comandante da Divisão de Reconhecimento. Um líder visionário, eloquente e com determinação inabalável, capaz de tomar decisões duríssimas pelo bem da humanidade. Foi responsável por inventar a formação estratégica de reconhecimento a longa distância e liderar a lendária investida em Shiganshina.",
            status = "Falecido",
            tita = "Humano",
            habilidade = "Liderança carismática suprema e planejamento tático em larga escala"
        ),
        Personagem(
            id = 6,
            nome = "Hange Zoë",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/hange-zoe.jpg",
            descricao = "Veterana de destaque da Divisão de Reconhecimento e sucessora designada por Erwin para se tornar a 14ª Comandante. Possui uma paixão científica vibrante e quase obsessiva pelo estudo da anatomia e do comportamento dos titãs, sendo a mente criadora das Lanças do Trovão (Thunder Spears).",
            status = "Falecido",
            tita = "Humana",
            habilidade = "Engenharia tática bélica e pesquisa biológica avançada sobre Titãs"
        ),
        Personagem(
            id = 7,
            nome = "Reiner Braun",
            categoria = "Guerreiros de Marley",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/reiner-braun.jpg",
            descricao = "Herdeiro do Titã Blindado e vice-comandante da Unidade de Guerreiros de Marley. Infiltrou-se nas muralhas ao lado de Bertholdt e Annie como recruta da 104ª Tropa de Cadetes. Devido à imensa pressão psicológica e culpa, desenvolveu uma dupla personalidade dividida entre o soldado exemplar e o guerreiro patriota.",
            status = "Vivo",
            tita = "Titã Blindado",
            habilidade = "Armadura corporal impenetrável e alta tenacidade física"
        ),
        Personagem(
            id = 8,
            nome = "Bertholdt Hoover",
            categoria = "Guerreiros de Marley",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/bertholdt-hoover.jpg",
            descricao = "Guerreiro de Marley e o portador original do Titã Colossal que destruiu o Portão de Shiganshina. Calmo, reservado e observador, dominava com maestria a emissão instantânea de vapor superaquecido capaz de repelir e queimar qualquer agressor que tentasse se aproximar.",
            status = "Falecido",
            tita = "Titã Colossal",
            habilidade = "Altura massiva de 60 metros e ejeção instantânea de vapor escaldante"
        ),
        Personagem(
            id = 9,
            nome = "Annie Leonhart",
            categoria = "Polícia Militar",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/annie-leonhart.jpg",
            descricao = "Guerreira de Marley enviada em missão às muralhas, onde se infiltrou na Polícia Militar de Wall Sina. Detentora do Titã Fêmea, Annie possui habilidades letais de artes marciais de contato, além da capacidade de endurecer partes pontuais de seu corpo em cristal diamantino e atrair titãs com seu grito.",
            status = "Vivo",
            tita = "Titã Fêmea",
            habilidade = "Artes marciais letais e cristalização defensiva impenetrável"
        ),
        Personagem(
            id = 10,
            nome = "Sasha Braus",
            categoria = "Divisão de Reconhecimento",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/sasha-braus.jpg",
            descricao = "Nascida na vila de caçadores de Dauper em Wall Rose, Sasha possui sentidos apuradíssimos, audição aguçada e pontaria de precisão com arco e flechas ou rifles. Famosa pelo seu amor sincero por comida e por sua lealdade calorosa aos amigos.",
            status = "Falecido",
            tita = "Humana",
            habilidade = "Instinto de rastreamento de caçadora e tiro de alta precisão"
        ),
        Personagem(
            id = 11,
            nome = "Historia Reiss",
            categoria = "Realeza de Eldia",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/historia-reiss.jpg",
            descricao = "Filha de Rod Reiss, adotou inicialmente o pseudônimo de Christa Lenz. Com o apoio da Divisão de Reconhecimento, rejeitou as manipulações de seu pai, assumiu sua verdadeira identidade e foi coroada a Rainha legítima das Muralhas, governando com compaixão e determinação.",
            status = "Vivo",
            tita = "Humana (Sangue Real de Eldia)",
            habilidade = "Liderança monárquica benevolente e linhagem real eldiana"
        ),
        Personagem(
            id = 12,
            nome = "Zeke Yeager",
            categoria = "Guerreiros de Marley",
            imagemUrl = "https://raw.githubusercontent.com/lut3k-IT/aot-app/main/public/assets/img/heroes/zeke-jaeger.jpg",
            descricao = "Meio-irmão mais velho de Eren e Chefe de Guerra de Marley. Portador do Titã Bestial, possui sangue real da família Fritz por parte de sua mãe, Dina, permitindo transformar eldianos em titãs puros através de seu fluido espinhal e comandá-los diretamente através de rugidos.",
            status = "Falecido",
            tita = "Titã Bestial",
            habilidade = "Arremesso de projéteis de artilharia e controle de titãs"
        )
    )

    fun listarTodos(): List<Personagem> = personagens

    fun buscarPorId(id: Int): Personagem? = personagens.find { it.id == id }
}
