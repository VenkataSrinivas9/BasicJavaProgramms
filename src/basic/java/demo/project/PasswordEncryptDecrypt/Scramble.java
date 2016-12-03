package basic.java.demo.project.PasswordEncryptDecrypt;

import java.io.UnsupportedEncodingException;

/**
 * Class that scrambles to read passed character string at one view
 *
 */
public class Scramble {

    /** Constant for standard value of byte */
    private static final int BB = 128;

    /** The encode table */
    private static byte[] encodeTable = new byte[] { 0x00 - BB, 0x01 - BB,
            0x02 - BB, 0x03 - BB, 0x04 - BB, 0x05 - BB, 0x06 - BB, 0x07 - BB,
            0x08 - BB, 0x09 - BB, 0x0a - BB, 0x0b - BB, 0x0c - BB, 0x0d - BB,
            0x0e - BB, 0x0f - BB, 0x10 - BB, 0x11 - BB, 0x12 - BB, 0x13 - BB,
            0x14 - BB, 0x15 - BB, 0x16 - BB, 0x17 - BB, 0x18 - BB, 0x19 - BB,
            0x1a - BB, 0x1b - BB, 0x1c - BB, 0x1d - BB, 0x1e - BB, 0x1f - BB,
            0x20 - BB, 0x21 - BB, 0x22 - BB, 0x23 - BB, 0x24 - BB, 0x25 - BB,
            0x26 - BB, 0x27 - BB, 0x28 - BB, 0x29 - BB, 0x2a - BB, 0x2b - BB,
            0x2c - BB, 0x2d - BB, 0x2e - BB, 0x2f - BB, 0x30 - BB, 0x31 - BB,
            0x32 - BB, 0x33 - BB, 0x34 - BB, 0x35 - BB, 0x36 - BB, 0x37 - BB,
            0x38 - BB, 0x39 - BB, 0x3a - BB, 0x3b - BB, 0x3c - BB, 0x3d - BB,
            0x3e - BB, 0x3f - BB,

            0x40 - BB, 0x41 - BB, 0x42 - BB, 0x43 - BB, 0x44 - BB, 0x45 - BB,
            0x46 - BB, 0x47 - BB, 0x48 - BB, 0x49 - BB, 0x4a - BB, 0x4b - BB,
            0x4c - BB, 0x4d - BB, 0x4e - BB, 0x4f - BB, 0x50 - BB, 0x51 - BB,
            0x52 - BB, 0x53 - BB, 0x54 - BB, 0x55 - BB, 0x56 - BB, 0x57 - BB,
            0x58 - BB, 0x59 - BB, 0x5a - BB, 0x5b - BB, 0x5c - BB, 0x5d - BB,
            0x5e - BB, 0x5f - BB, 0x60 - BB, 0x61 - BB, 0x62 - BB, 0x63 - BB,
            0x64 - BB, 0x65 - BB, 0x66 - BB, 0x67 - BB, 0x68 - BB, 0x69 - BB,
            0x6a - BB, 0x6b - BB, 0x6c - BB, 0x6d - BB, 0x6e - BB, 0x6f - BB,
            0x70 - BB, 0x71 - BB, 0x72 - BB, 0x73 - BB, 0x74 - BB, 0x75 - BB,
            0x76 - BB, 0x77 - BB, 0x78 - BB, 0x79 - BB, 0x7a - BB, 0x7b - BB,
            0x7c - BB, 0x7d - BB, 0x7e - BB, 0x7f - BB,

            0x84 - BB, 0x85 - BB, 0x86 - BB, 0x87 - BB, 0x80 - BB, 0x81 - BB,
            0x82 - BB, 0x83 - BB, 0x8c - BB, 0x8d - BB, 0x8e - BB, 0x8f - BB,
            0x88 - BB, 0x89 - BB, 0x8a - BB, 0x8b - BB, 0x94 - BB, 0x95 - BB,
            0x96 - BB, 0x97 - BB, 0x90 - BB, 0x91 - BB, 0x92 - BB, 0x93 - BB,
            0x9c - BB, 0x9d - BB, 0x9e - BB, 0x9f - BB, 0x98 - BB, 0x99 - BB,
            0x9a - BB, 0x9b - BB, 0xa4 - BB, 0xa5 - BB, 0xa6 - BB, 0xa7 - BB,
            0xa0 - BB, 0xa1 - BB, 0xa2 - BB, 0xa3 - BB, 0xac - BB, 0xad - BB,
            0xae - BB, 0xaf - BB, 0xa8 - BB, 0xa9 - BB, 0xaa - BB, 0xab - BB,
            0xb4 - BB, 0xb5 - BB, 0xb6 - BB, 0xb7 - BB, 0xb0 - BB, 0xb1 - BB,
            0xb2 - BB, 0xb3 - BB, 0xbc - BB, 0xbd - BB, 0xbe - BB, 0xbf - BB,
            0xb8 - BB, 0xb9 - BB, 0xba - BB, 0xbb - BB, 0xc4 - BB, 0xc5 - BB,
            0xc6 - BB, 0xc7 - BB, 0xc0 - BB, 0xc1 - BB, 0xc2 - BB, 0xc3 - BB,
            0xcc - BB, 0xcd - BB, 0xce - BB, 0xcf - BB, 0xc8 - BB, 0xc9 - BB,
            0xca - BB, 0xcb - BB, 0xd4 - BB, 0xd5 - BB, 0xd6 - BB, 0xd7 - BB,
            0xd0 - BB, 0xd1 - BB, 0xd2 - BB, 0xd3 - BB, 0xdc - BB, 0xdd - BB,
            0xde - BB, 0xdf - BB, 0xd8 - BB, 0xd9 - BB, 0xda - BB, 0xdb - BB,
            0xe4 - BB, 0xe5 - BB, 0xe6 - BB, 0xe7 - BB, 0xe0 - BB, 0xe1 - BB,
            0xe2 - BB, 0xe3 - BB, 0xec - BB, 0xed - BB, 0xee - BB, 0xef - BB,
            0xe8 - BB, 0xe9 - BB, 0xea - BB, 0xeb - BB, 0xf4 - BB, 0xf5 - BB,
            0xf6 - BB, 0xf7 - BB, 0xf0 - BB, 0xf1 - BB, 0xf2 - BB, 0xf3 - BB,
            0xfc - BB, 0xfd - BB, 0xfe - BB, 0xff - BB, 0xf8 - BB, 0xf9 - BB,
            0xfa - BB, 0xfb - BB };

    /** The encode table */
    private static byte[] decodeTable = new byte[encodeTable.length];

    /**
     * Static initialization
     */
    static {
        for (int i = -BB; i < BB; i++) {
            decodeTable[encodeTable[i + BB] + BB] = (byte) i;
        }
    }

    /**
     * Default Constructor. Made as private so as to avoid instances being
     * created.
     */
    private Scramble() {
        // Empty constructor
    }

    /**
     * This method is used encode the input character string
     * <p>
     * The encoding algorithm is described below <br>
     * output[0] = encodeTable[ input[0] ]<br>
     * output[i] = encodeTable[ input[i] ] ^ output[i-1]<br>
     *
     * @param str
     *            The input character string to be encoded
     * @return the encoded string
     */
    public static String encode(String str) {

        try {
            int length = str != null ? str.length() : 0;

            if (length <= 0) {
                return str;
            }

            byte[] ret = str.getBytes("UTF-8"); //$NON-NLS-1$

            ret[0] = encodeTable[ret[0] + BB];

            for (int i = 1; i < ret.length; i++) {
                ret[i] = (byte) ((int) encodeTable[ret[i] + BB] ^ (int) ret[i - 1]);
            }

            return new String(ret, "UTF-8"); //$NON-NLS-1$
        }
        catch (UnsupportedEncodingException e) {
            // Do Nothing
        }

        return ""; //$NON-NLS-1$
    }

    /**
     * This method is used decode the input character string
     * <p>
     * The decoding algorithm is described below <br>
     * output[0] = decodeTable[ input[0] ]<br>
     * output[i] = decodeTable[ input[i]^input[i-1] ]<br>
     *
     * @param str
     *            - The input character string to be encoded
     * @return the decoded string
     */
    public static String decode(String str) {

        try {
            int length = str != null ? str.length() : 0;

            if (length <= 0) {
                return str;
            }

            byte[] ret = str.getBytes("UTF-8"); //$NON-NLS-1$

            for (int i = ret.length - 1; i > 0; i--) {
                ret[i] = decodeTable[(ret[i] ^ ret[i - 1]) + BB];
            }

            ret[0] = decodeTable[ret[0] + BB];

            return new String(ret, "UTF-8"); //$NON-NLS-1$
        }
        catch (UnsupportedEncodingException e) {
            // Do Nothing
        }

        return ""; //$NON-NLS-1$
    }
}