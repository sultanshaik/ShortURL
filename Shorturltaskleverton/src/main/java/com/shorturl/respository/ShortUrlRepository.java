package com.shorturl.respository;

import com.shorturl.URL;
import org.springframework.data.repository.CrudRepository;

public interface ShortUrlRepository extends CrudRepository<URL,Integer> {
    
}
