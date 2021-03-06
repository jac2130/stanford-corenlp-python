/**
 * Title:        StanfordMaxEnt<p>
 * Description:  A Maximum Entropy Toolkit<p>
 * Copyright:    Copyright (c) Kristina Toutanova<p>
 * Company:      Stanford University<p>
 * @author Kristina Toutanova
 * @version 1.0
 */

package edu.stanford.nlp.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//: com:bruceeckel:tools:OutFile.java
// Shorthand class for opening an output file
// for data storage.


public class OutDataStreamFile extends DataOutputStream {
  public OutDataStreamFile(String filename) throws IOException {
    this(new File(filename));
  }

  public OutDataStreamFile(File file) throws IOException {
    super(new BufferedOutputStream(new FileOutputStream(file)));
  }
} ///:~
