/**
 * Created by Kevko on 2016-05-27.
 */
class Example {
    static void main(String[] args) {
        new File('C:/Users/Kevko/IdeaProjects/groovy-file-io/src', 'example.txt').eachLine { line, lineNum ->
            println "${lineNum} : ${line}"
        }
    }
}
