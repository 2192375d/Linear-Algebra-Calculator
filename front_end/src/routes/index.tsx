import { createFileRoute } from '@tanstack/react-router'

export const Route = createFileRoute('/')({
  component: Index,
})

function Index() {
  return (
    <div className="p-2 bg-amber-200">
      <h3>Welcome Home!</h3>
    </div>
  )
}
