package com.sharad.ridersspot.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

public interface JwtService {
    public String extractUsername(String token);
    public Date extractExpiration(String token);
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver);
    public Claims extractAllClaims(String token);
    public Boolean isTokenExpired(String token);
    public Boolean isTokenValid(String token, UserDetails userDetails);
    public String generateToken(UserDetails userDetails);
    public String createToken(Map<String, Object> claims, UserDetails userDetails);
    public Key getSignKey();
}