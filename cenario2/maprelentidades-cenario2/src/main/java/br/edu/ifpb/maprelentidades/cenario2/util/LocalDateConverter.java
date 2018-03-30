package br.edu.ifpb.maprelentidades.cenario2.util;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author jozimar
 */
@Converter(autoApply = false)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate x) {
        if (x == null) {
            return null;
        }
        return Date.valueOf(x);
    }

    @Override
    public LocalDate convertToEntityAttribute(Date y) {
        if (y == null) {
            return null;
        }
        return y.toLocalDate();
    }
}
