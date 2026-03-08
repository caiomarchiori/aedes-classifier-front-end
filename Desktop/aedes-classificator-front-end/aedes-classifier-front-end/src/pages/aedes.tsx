
import Link from "next/link";
import Mosquito from "../assets/mosquito.png"
import { InfoLayout } from "@/components/info-layout";

export default function Aedes() {
    const style = "text-blue-500 hover:underline"
    return (
        <InfoLayout
            image={Mosquito}
            imageAlt="Mosquito"
            font="https://www.bbc.com/portuguese/articles/crgeqq9j2l1o"
            imageWidth={500}
        >
            <p className="text-lg">
                O <strong><em>Aedes aegypti</em></strong> é a principal espécie de mosquito responsável pela transmissão de doenças como <Link className={style} href="/dengue">dengue</Link>,
                <Link className={style} href="/chikungunya"> chikungunya</Link> e <Link className={style} href="/chikungunya">Zika</Link>. Esse mosquito pode ser identificado
                por apresentar <strong>marcas brancas nas pernas e no dorso</strong>, formando um desenho semelhante a uma <strong>lira</strong>.
                <br></br>
                Trata-se de uma espécie com hábitos predominantemente <strong>domésticos</strong>, sendo encontrada dentro ou nas proximidades de residências e em locais frequentemente ocupados
                por pessoas, como <strong>escolas, comércios e igrejas</strong>.
                <br></br>
                A <strong>fêmea do mosquito</strong>, que possui hábitos majoritariamente <strong>diurnos</strong>, alimenta-se de <strong>sangue humano</strong> para possibilitar o
                desenvolvimento e a maturação de seus ovos.
                A presença do  <em>Aedes aegypti</em> é mais comum em ambientes <strong>urbanos</strong>, especialmente em áreas com grande concentração de pessoas e com disponibilidade de locais adequados
                para a deposição de ovos. Fatores ambientais, como <strong>temperatura e volume de chuvas</strong>, também influenciam diretamente o nível de infestação desse mosquito.
                <br></br>
                Para reduzir a proliferação do vetor, é fundamental adotar <strong>medidas contínuas de controle</strong>, principalmente por meio da eliminação de possíveis criadouros ao
                longo de todo o ano.
                Nesse contexto, a <strong>participação da população é essencial no combate a doenças</strong> como dengue, chikungunya e Zika, contribuindo para o controle do mosquito.
                Enquanto não há tratamento específico amplamente disponível para essas doenças, a estratégia mais eficaz de <strong>saúde pública</strong> consiste no <strong>controle vetorial</strong>.
                Esse controle envolve ações de vigilância entomológica, responsáveis pelo monitoramento da presença do mosquito, além da aplicação de diferentes métodos
                voltados à redução da população do  <em>Aedes aegypti</em>, vetor responsável pela transmissão dessas enfermidades.
                <br></br>
                <br></br>
                Adaptado de Ministério da Saúde do Brasil:
                <a
                    href="https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/a/aedes-aegypti"
                    target="_blank"
                    rel="noopener noreferrer"
                    className="ml-2 text-blue-500 hover:underline"
                >
                    https://www.gov.br/saude/pt-br/assuntos/saude-de-a-a-z/a/aedes-aegypti
                </a>
            </p>
        </InfoLayout>

    );
}