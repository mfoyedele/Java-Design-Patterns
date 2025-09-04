package com.funso.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

/** Check whether the execution of the main method in {@link App} throws an exception. */
class AppTest {

  @Test
  void shouldExecuteApplicationWithoutException() {

    assertDoesNotThrow(() -> App.main(new String[] {}));
  }
}