// Fib1.java
// From Classic Computer Science Problems in Java Chapter 1
// Copyright 2020 David Kopec
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.davekopec.ccspij.chapter1;

public class Fib1 {

    // This method will cause a java.lang.StackOverflowError
    public static int fib1(int n) {
        //TODO Fix :)
        /**
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        */
        return fib1(n - 1) + fib1(n - 2);
    }

    public static void main(String[] args) {
        // Don't run this!
        System.out.println(fib1(5));
    }
}
