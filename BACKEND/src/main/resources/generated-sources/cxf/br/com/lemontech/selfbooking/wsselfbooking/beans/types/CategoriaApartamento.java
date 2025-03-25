
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de categoriaApartamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="categoriaApartamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SEM_INFORMACAO"/&gt;
 *     &lt;enumeration value="SIMPLES"/&gt;
 *     &lt;enumeration value="MEDIO_CONFORTO"/&gt;
 *     &lt;enumeration value="CONFORTAVEL"/&gt;
 *     &lt;enumeration value="MUITO_CONFORTAVEL"/&gt;
 *     &lt;enumeration value="LUXO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "categoriaApartamento")
@XmlEnum
public enum CategoriaApartamento {

    SEM_INFORMACAO,
    SIMPLES,
    MEDIO_CONFORTO,
    CONFORTAVEL,
    MUITO_CONFORTAVEL,
    LUXO;

    public String value() {
        return name();
    }

    public static CategoriaApartamento fromValue(String v) {
        return valueOf(v);
    }

}
