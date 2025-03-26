
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de perfilFuncionario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="perfilFuncionario"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ZERO"/&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="GESTOR"/&gt;
 *     &lt;enumeration value="APROVADOR"/&gt;
 *     &lt;enumeration value="SOLICITANTE"/&gt;
 *     &lt;enumeration value="PASSAGEIRO"/&gt;
 *     &lt;enumeration value="AGENCIA"/&gt;
 *     &lt;enumeration value="ADMINISTRADOR"/&gt;
 *     &lt;enumeration value="SOLICITANTE_MASTER"/&gt;
 *     &lt;enumeration value="APROVADOR_MASTER"/&gt;
 *     &lt;enumeration value="NEUTRO"/&gt;
 *     &lt;enumeration value="PASSAGEIRO_TERCEIRO"/&gt;
 *     &lt;enumeration value="ACORDO"/&gt;
 *     &lt;enumeration value="HOTELARIA"/&gt;
 *     &lt;enumeration value="AGENCIA_GESTOR"/&gt;
 *     &lt;enumeration value="OPERADOR_AEROPORTO"/&gt;
 *     &lt;enumeration value="CONEXAO_GESTOR"/&gt;
 *     &lt;enumeration value="USUARIO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionario")
@XmlEnum
public enum PerfilFuncionario {

    ZERO,
    ADM,
    GESTOR,
    APROVADOR,
    SOLICITANTE,
    PASSAGEIRO,
    AGENCIA,
    ADMINISTRADOR,
    SOLICITANTE_MASTER,
    APROVADOR_MASTER,
    NEUTRO,
    PASSAGEIRO_TERCEIRO,
    ACORDO,
    HOTELARIA,
    AGENCIA_GESTOR,
    OPERADOR_AEROPORTO,
    CONEXAO_GESTOR,
    USUARIO;

    public String value() {
        return name();
    }

    public static PerfilFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
