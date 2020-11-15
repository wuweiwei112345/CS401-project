package com.pro.exception;

public class UnderflowException extends RuntimeException
{
  public UnderflowException()
  {
    super();
  }

  public UnderflowException(String message)
  {
    super(message);
  }
}