
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de perfilFuncionarioParametrizacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="perfilFuncionarioParametrizacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APROVADOR"/&gt;
 *     &lt;enumeration value="SOLICITANTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionarioParametrizacao")
@XmlEnum
public enum PerfilFuncionarioParametrizacao {

    APROVADOR,
    SOLICITANTE;

    public String value() {
        return name();
    }

    public static PerfilFuncionarioParametrizacao fromValue(String v) {
        return valueOf(v);
    }

}
