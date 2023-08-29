package com.mastercard.demofinal;

import java.util.List;

public interface T3SearchService {

	T3SearchResults getT3SearchResults(String name);

	List<T3SearchResults> getT3SearchResultsAll();

	List<T3SearchResults> putT3SrchResultsAll();

	T3SearchResults putT3SrchResults(String name);
}
