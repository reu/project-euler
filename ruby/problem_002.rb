fib = Enumerator.new do |yielder|
  a = 0
  b = 1

  loop do
    yielder.yield a
    b += a
    yielder.yield b
    a += b
  end
end

puts fib.take_while { |n| n < 4_000_000 }.select(&:even?).reduce(:+)
