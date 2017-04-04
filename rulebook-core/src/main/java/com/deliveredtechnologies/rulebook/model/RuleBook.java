package com.deliveredtechnologies.rulebook.model;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.Result;

import java.util.Optional;

public interface RuleBook<T> {
  void addRule(Rule rule);
  void run(NameValueReferableMap facts);
  void setDefaultResult(T result);
  Optional<Result<T>> getResult();
  default void defineRules() { };
  boolean hasRules();
}
