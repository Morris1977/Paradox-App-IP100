package com.Paradox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/* renamed from: com.Paradox.ca */
/* loaded from: /tmp/jadx-15533408702657097178.dex */
class ca {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
public static bz a(ag agVar, String str) throws Throwable {
    FileInputStream fileInputStream = null;
    //e;
    ObjectInputStream objectInputStream;
    bz bzVar = null;
    ObjectInputStream objectInputStream2 = null;
    Throwable th;
    ObjectInputStream e = null;
    try {
        try {
            fileInputStream = MyApplication.acon().openFileInput(str);
        } catch (Throwable th6) {
           // th = th;
            objectInputStream2 = e;
        }
    } catch (Exception e3) {
        //e = e3;
        //e = 0;
        fileInputStream = null;
    } catch (Throwable th2) {
        th = th2;
        fileInputStream = null;
    }
    try {
        e = new ObjectInputStream(fileInputStream);
        try {
            bzVar = (bz) e.readObject();
            e = e;
            int e2 = 0;
            if (e2 != 0) {
                try {
                    e.close();
                    e = e;
                } catch (IOException e4) {
                    e4.printStackTrace();
                    //e = e4;
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    //e = e5;
                    //e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e6) {
            objectInputStream = e;
            FileInputStream e1 = fileInputStream;
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
            }
            int e3 = 0;
            if (e3 != 0) {
                e.close();
                bzVar = null;
                if (bzVar == null) {
                }
            }
            bzVar = null;
            if (bzVar == null) {
            }
        } catch (Exception e9) {
            //e = e9;
            //e.printStackTrace();
            int e4 = 0;
            if (e4 != 0) {
                e.close();
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    bzVar = null;
                } catch (IOException e11) {
                    e11.printStackTrace();
                    bzVar = null;
                }
                if (bzVar == null) {
                }
            }
            bzVar = null;
            if (bzVar == null) {
            }
        }
    } catch (FileNotFoundException e12) {
        objectInputStream = null;
        //e = fileInputStream;
    } catch (Exception e13) {
        //e = e13;
        //e = 0;
    } catch (Throwable th3) {
        th = th3;
        if (objectInputStream2 != null) {
            try {
                objectInputStream2.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e15) {
                e15.printStackTrace();
            }
        }
        throw th;
    }
    return bzVar == null ? new bz(agVar, str) : bzVar;
}

/* JADX WARN: Removed duplicated region for block: B:76:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
/* JADX WARN: Removed duplicated region for block: B:78:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
/* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
public static void a(bz bzVar) throws Exception {
    FileOutputStream fileOutputStream = null;
    ObjectOutputStream objectOutputStream = null;
    ObjectOutputStream objectOutputStream2 = null;
    objectOutputStream2 = null;
    objectOutputStream2 = null;
    objectOutputStream2 = null;
    objectOutputStream2 = null;
    FileOutputStream fileOutputStream2 = null;
    objectOutputStream2 = null;
    objectOutputStream2 = null;
    Throwable th;
    try {
        try {
            fileOutputStream = MyApplication.acon().openFileOutput(bzVar.a, 0);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
            } catch (FileNotFoundException e) {
                e = e;
                objectOutputStream = null;
                fileOutputStream2 = fileOutputStream;
            } catch (Exception e2) {
                //e = e2;
            }
        } catch (Throwable th5) {
            //th = th;
        }
    } catch (Exception e4) {
        //e = e4;
        fileOutputStream = null;
    } catch (Throwable th2) {
        th = th2;
        fileOutputStream = null;
    }
    try {
        objectOutputStream.writeObject(bzVar);
        objectOutputStream.flush();
        if (objectOutputStream != null) {
            try {
                objectOutputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
    } catch (FileNotFoundException e7) {
        //e = e7;
        fileOutputStream2 = fileOutputStream;
        try {
            e.printStackTrace();
            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = fileOutputStream2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            Exception th8 = null;
            throw th8;
        }
    } catch (Exception e12) {
        //e = e12;
        objectOutputStream2 = objectOutputStream;
        e.printStackTrace();
        if (objectOutputStream2 != null) {
            try {
                objectOutputStream2.close();
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
    } catch (Throwable th4) {
        Throwable th1 = th4;
        objectOutputStream2 = objectOutputStream;
        if (objectOutputStream2 != null) {
        }
        if (fileOutputStream != null) {
        }
        Exception th7 = null;
        throw th7;
    }
}
}
