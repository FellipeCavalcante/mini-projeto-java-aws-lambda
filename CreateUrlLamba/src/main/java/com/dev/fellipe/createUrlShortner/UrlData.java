package com.dev.fellipe.createUrlShortner;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class UrlData {
    private String originalUrl;
    private long expirationTime;
}
