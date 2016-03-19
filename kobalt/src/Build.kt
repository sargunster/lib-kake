import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.publish.bintray

object Versions {
    val kotlin = "1.0.1"
    val testng = "6.9.9"
}

@Suppress("unused")
val p = project {

    name = "CakeParse"
    group = "me.sargunvohra.lib"
    artifactId = name
    version = "1.0.7"

    dependencies {
    	compile("org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}")
    }

    dependenciesTest {
    	compile("org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}")
        compile("org.testng:testng:${Versions.testng}")
    }

    assemble {
        jar {
        }
        mavenJars {
        }
    }

    bintray {
        publish = true
    }
}