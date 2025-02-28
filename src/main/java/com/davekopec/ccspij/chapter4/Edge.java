// Edge.java
// From Classic Computer Science Problems in Java Chapter 4
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

package com.davekopec.ccspij.chapter4;

public class Edge {
	public final int u; // the "from" vertex
	public final int v; // the "to" vertex

	public Edge(int u, int v) {
		this.u = u;
		this.v = v;
	}

	public Edge reversed() {
		return new Edge(v, u);
	}

	@Override
	public String toString() {
		return u + " -> " + v;
	}

}
