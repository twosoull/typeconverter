package hello.typeconverter.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class MyNumberFormatter implements Formatter<Number> {

    @Override
    public Number parse(String text, Locale locale) throws ParseException { // String을 Integer로 변환
      log.info("text={}, locale={}",text,locale);
      //"1,000" --> 1000
        NumberFormat format = NumberFormat.getInstance(locale);
        return format.parse(text);

    }

    public String print(Number object, Locale locale) {//  Integer를 모양이 이쁘게 String으로 변환
        log.info("object={}, locale={}" , object,locale);
        //NumberFormat instance = NumberFormat.getInstance(locale);
        //String format = instance.format(object);
        return NumberFormat.getInstance(locale).format(object);
    }
}
