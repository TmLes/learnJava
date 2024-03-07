package com.walking.fuctionalProg.tasks.biFunc;

@FunctionalInterface
interface BinaryFunction<T, U, R> {
   R apply(T arg1, U arg2);
}
