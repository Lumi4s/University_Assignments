{ pkgs ? import <nixpkgs> {} }:

let
  jdk = pkgs.jdk25;
in
pkgs.mkShell {
  name = "java-25-dev-env";
  buildInputs = [
    jdk
    pkgs.maven            
    pkgs.gradle           
    pkgs.git
    pkgs.zlib            
  ];

  shellHook = ''
    export JAVA_HOME="${jdk.home}"
    export PATH="$JAVA_HOME/bin:$PATH"
    export LD_LIBRARY_PATH="${pkgs.lib.makeLibraryPath [ pkgs.zlib pkgs.stdenv.cc.cc.lib ]}:$LD_LIBRARY_PATH"

    echo "==========================================="
    echo "  Java 25 Dev Shell активирован"
    echo "  JAVA_HOME: $JAVA_HOME"
    echo "==========================================="
    java -version
  '';
}