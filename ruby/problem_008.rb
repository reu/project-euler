numbers = File.read("./problem_008.txt").gsub(/\r?\n/, "").chars.map(&:to_i)

puts numbers.each_cons(13).map { |serie| serie.reduce(:*) }.max
