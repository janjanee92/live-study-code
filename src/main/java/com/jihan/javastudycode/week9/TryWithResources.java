package com.jihan.javastudycode.week9;

import java.io.*;

public class TryWithResources {

    static void copy(String src, String dest) throws IOException{
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dest)) {
            byte [] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
