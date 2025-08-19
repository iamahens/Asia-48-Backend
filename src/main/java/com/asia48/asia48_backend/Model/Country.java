package com.asia48.asia48_backend.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String flagUrl;
    private String currency;
    private String language;
    private String pageUrl; // e.g., "/destinations/japan"

    @Column(columnDefinition = "TEXT") // Also good practice for potentially long overviews
    private String countryOverview;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Visa> visas;

    // --- Getters and Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getFlagUrl() { return flagUrl; }
    public void setFlagUrl(String flagUrl) { this.flagUrl = flagUrl; }
    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public String getPageUrl() { return pageUrl; }
    public void setPageUrl(String pageUrl) { this.pageUrl = pageUrl; }
    public String getCountryOverview() { return countryOverview; }
    public void setCountryOverview(String countryOverview) { this.countryOverview = countryOverview; }
    public List<Visa> getVisas() { return visas; }
    public void setVisas(List<Visa> visas) { this.visas = visas; }
}
