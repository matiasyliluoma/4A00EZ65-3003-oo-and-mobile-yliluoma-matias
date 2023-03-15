import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.Path

fun readLines(vararg fileNames: String) {
    for (fileName in fileNames) {
        var path : Path = Paths.get(fileName)
        var lines =  Files.readAllLines(path)
       // var lines = java.util.List<String> = Files.readAllLines(path) didnt work
        for(line in lines) {
            if(line.contains("\t")) {
                var newLine = line.replace("\t", "____") 
                println("$fileName\n$newLine")
            } 
        }
    }


}

fun main(args: Array<String>) {
    readLines(*args)
}