package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;

/**
 * Created by Luckyz on 7/27/2018.
 */
//@Configuration
public class ChuckConfiguration {
@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes()
    {
        return new ChuckNorrisQuotes();

    }

}
