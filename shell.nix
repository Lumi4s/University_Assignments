{ pkgs ? import <nixpkgs> {} }:

let
  jdk = pkgs.jdk25;
in
pkgs.mkShell {
  name = "java-25-dev-env";

  packages = [
    jdk
    pkgs.maven
    pkgs.gradle
    pkgs.git
  ];

  shellHook = ''
    export JAVA_HOME="${jdk.home}"

    echo "Java 25 Dev Environment"
    echo "JAVA_HOME: $JAVA_HOME"

    java -version
  '';
}