require 'thor'
require 'thor/group'
require 'find'

class RupringGenerator < Thor::Group
  include Thor::Actions

  def self.source_root
    File.dirname(__FILE__)
  end

  def app_name
    'spring-boot'
  end

  def base_package
    "br.com.dimed.#{app_name}"
  end

  def class_name
    Thor::Util.camel_case(app_name)
  end

  def file_name
    class_name
  end

  def parameter_name
    Thor::Util.camel_case(app_name).sub(/^w/) {|l| l.downcase}
  end

  def package_tree
    base_package.gsub!('.','/')
  end

  def apply_directory_template
    directory('template', app_name)
  end

  def gradle_build
    inside(app_name) do
      run("#{ENV['GRADLE_HOME']}/bin/gradle build")
    end
  end

=begin
  def delete_dir
    remove_dir("#{destination_root}/#{app_name}")
  end
=end

end

generator = RupringGenerator.new
generator.invoke_all

