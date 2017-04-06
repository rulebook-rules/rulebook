package com.deliveredtechnologies.rulebook.lang;

import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.Result;
import com.deliveredtechnologies.rulebook.model.Rule;
import com.deliveredtechnologies.rulebook.model.RuleBook;

import java.util.Optional;

/**
 * Created by clong on 4/6/17.
 */
public class SampleRuleBook2<T> implements RuleBook<T> {

  private SampleRuleBook2() {

  }

  private SampleRuleBook2(Class<T> resultType) {

  }

  @Override
  public void addRule(Rule rule) {

  }

  @Override
  public void run(NameValueReferableMap facts) {

  }

  @Override
  public void setDefaultResult(T result) {

  }

  @Override
  public Optional<Result<T>> getResult() {
    return null;
  }

  @Override
  public boolean hasRules() {
    return false;
  }
}
