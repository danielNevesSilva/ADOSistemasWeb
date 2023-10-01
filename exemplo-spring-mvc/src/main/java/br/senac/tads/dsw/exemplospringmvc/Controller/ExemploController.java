package br.senac.tads.dsw.exemplospringmvc.Controller;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
@Controller
@RequestMapping("/exemplo")
public class ExemploController {
    @GetMapping("/exemplo-view-obj")
    public ModelAndView  exemploViewObj(){
        ModelAndView mv = new ModelAndView ("index");
        mv.addObject("nome", "Daniel Neves");
        mv.addObject("email", "neves2590@gmail.com");
        mv.addObject("nascimento", "22/04/2001" );
        mv.addObject("git", "https://github.com/danielNevesSilva" );

        mv.addObject("linkedin", "https://www.linkedin.com/in/daniel-neves-8430b317b/" );

        mv.addObject("curso1", " Dominar Programação Orientada a Objetos e linguagem Java\n" +
                "                    Criar soluções flexíveis, extensíveis e testáveis\n" +
                "                    Adquirir a base sólida teórica e prática para ser um desenvolvedor Java de sucesso\n" +
                "                    Aplicar o conhecimento de orientação a objetos na construção de soluções para problemas reais\n" +
                "                    Compreender diagramas de classe UML, tanto de entidades quanto de serviços\n" +
                "                    Desenvolver aplicações para desktop com interface gráfica\n" +
                "                    Construir web services usando Spring Boot e boas práticas\n" +
                "                    Acessar banco de dados relacionais com comandos SQL (JDBC) e também com ORM (JPA/Hibernate)\n" +
                "                    Acessar banco de dados NoSQL" );

        mv.addObject("curso2", "Estrutura de Dados em Java" +
                "Arrays.\n" +
                "                    Pilhas.\n" +
                "                    Filas.\n" +
                "                    Listas vinculadas.\n" +
                "                    Árvores." );

        mv.addObject("curso3", "Principais Protocolos de Comunicação da Internet\n" +
                "Protocolo TCP/IP, Protocolo HTTP, Protocolo HTTPS, Protocolo FTP" );

        mv.addObject("projetos", "Projetos realizados :  Forum-de-comunicacao - Desenvolvimento back-end em Java utilizando Spring Boot e MongoDB" +
                " Loja-de-camisa - Desenvolvimento back-end com servlet, integração com banco de dados H2 e conexão web" +
                "Loja-de-utilitarios - Integração com banco de dados PostgreSQL em aplicação back-end" +
                "Loja-de-material-de-construção - Integração com banco de dados MySQL utilizando Java Swing" );


        mv.addObject("Exeperiencia","Estagiario na Trevisan escola de negocios" +
                " Trabalhou em equipe,\n" +
                "                    Suporte técnico a máquinas e equipamentos,\n" +
                "                    Atendimento de chamados utilizando o sistema Eleven CRM,\n" +
                "                    Realização de uploads de arquivos para o Google Drive,\n" +
                "                    Implementação e suporte a programas como Microsoft Teams");

        return mv;
    }
}